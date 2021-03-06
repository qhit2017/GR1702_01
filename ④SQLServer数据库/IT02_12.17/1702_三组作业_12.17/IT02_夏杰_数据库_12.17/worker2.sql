USE [db_worker]
GO
/****** Object:  Table [dbo].[Table_2]    Script Date: 12/17/2017 19:41:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_2](
	[id] [tinyint] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nchar](10) NOT NULL,
	[remark] [ntext] NULL,
 CONSTRAINT [PK_Table_2] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
