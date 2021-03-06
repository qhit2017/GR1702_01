USE [db_worker]
GO
/****** Object:  Table [dbo].[tb_worker1]    Script Date: 12/17/2017 18:26:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_worker1](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[department] [nvarchar](50) NOT NULL,
	[remarks] [ntext] NOT NULL,
	[recommend] [bit] NOT NULL,
	[age] [tinyint] NOT NULL,
 CONSTRAINT [PK_tb_worker1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
