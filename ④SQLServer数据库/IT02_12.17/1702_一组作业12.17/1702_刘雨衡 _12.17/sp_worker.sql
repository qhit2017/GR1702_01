USE [db_worker]
GO
/****** Object:  Table [dbo].[sp_worker]    Script Date: 12/17/2017 20:06:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sp_worker](
	[id] [nchar](10) NOT NULL,
	[name] [nchar](10) NOT NULL,
	[dateline] [date] NOT NULL,
	[salary] [money] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nchar](10) NOT NULL,
	[remark] [ntext] NOT NULL,
 CONSTRAINT [PK_sp_worker] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
